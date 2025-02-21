package au.org.greekwelfaresa.idempiere.test.common.utils;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.compiere.Adempiere;
import org.compiere.model.ServerStateChangeEvent;
import org.compiere.model.ServerStateChangeListener;

public class IDempiereStartup {

	public static void waitForAdempiereStart() {
		CountDownLatch flag = new CountDownLatch(1);
		synchronized (Adempiere.class) {
			if (Adempiere.isStarted()) {
				return;
			} else {
				// Can't reference "this" from within a lamda expression - that's why this is an
				// anonymous inner class instead.
				final ServerStateChangeListener l = new ServerStateChangeListener() {
					@Override
					public void stateChange(ServerStateChangeEvent event) {
						if (event.getEventType() == ServerStateChangeEvent.SERVER_START) {
							flag.countDown();
							Adempiere.removeServerStateChangeListener(this);
						}
					}
				};
				Adempiere.addServerStateChangeListener(l);
			}
		}
		try {
			if (!flag.await(30, TimeUnit.SECONDS)) {
				throw new IllegalStateException("iDempiere still not started after 30s");
			}
		} catch (InterruptedException e) {
			throw new IllegalStateException("Interrupted while for iDempiere to start", e);
		}
	}

}
