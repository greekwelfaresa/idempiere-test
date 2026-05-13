package au.org.greekwelfaresa.idempiere.test.common.gogo;

import java.util.Map;
import java.util.regex.Pattern;

import org.apache.felix.service.command.Descriptor;
import org.apache.felix.service.command.Parameter;
import org.compiere.util.CacheMgt;
import org.compiere.util.DB;
import org.osgi.service.component.annotations.Component;

@Component(property = {
		"osgi.command.scope=idempiere",
		"osgi.command.function=dumpThreads",
		"osgi.command.function=cacheReset"
		}, service = Object.class)
public class Commandlet {
	@Descriptor("Dump the stack trace of currently running threads")
	public String dumpThreads(
			@Descriptor("show the names of the threads only") @Parameter(names = { "-n",
					"--names-only" }, presentValue = "true", absentValue = "false") boolean namesOnly) {
		return dumpThreads(namesOnly, null);
	}
	
	@Descriptor("Dump the stack trace of specified thread")
	public String dumpThreads(
			@Descriptor("show the names of the threads only") @Parameter(names = { "-n",
					"--names-only" }, presentValue = "true", absentValue = "false") boolean namesOnly,
			@Descriptor("regular expression matched against name of thread (if absent show all threads)") String pattern) {
		final StringBuilder b = new StringBuilder();
		b.append(DB.getSQLValueString(null, "SELECT version()"));
		Map<Thread, StackTraceElement[]> stacks = Thread.getAllStackTraces();
		b.append("\n").append(stacks.size()).append(" threads\n");
		Pattern p;
		if (pattern != null && !pattern.isEmpty()) {
			p = Pattern.compile(pattern);
		} else {
			p = null;
		}
		for (Map.Entry<Thread, StackTraceElement[]> entry : stacks.entrySet()) {
			final String name = entry.getKey().getName();
			if (p == null || p.matcher(name).matches()) {
				b.append("Thread: ").append(name).append("\n");
				if (!namesOnly) {
					for (StackTraceElement current : entry.getValue()) {
						b.append("* ")
								.append(current.getMethodName())
								.append(", ")
								.append(current.getFileName())
								.append(":")
								.append(current.getLineNumber())
								.append("\n");
					}
					b.append("\n");
				}
			}
		}
		return b.toString();
	}

	@Descriptor("Clears the iDempiere table caches")
	public String cacheReset() {
		return "Clearing table caches: " + CacheMgt.get().reset();
	}
}