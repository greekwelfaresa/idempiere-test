/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj;

import javax.annotation.Generated;

import org.assertj.core.api.SoftAssertionsProvider;
/** Generated soft assertions entry point
 *  @author idempiere-test model assertion generator 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public interface IDWebserviceModelSoftAssertionsProvider extends SoftAssertionsProvider {
	default au.org.greekwelfaresa.idempiere.test.assertj.ws_webservice.WS_WebServiceAssert assertThat(org.idempiere.webservices.model.X_WS_WebService a) {
		return proxy(au.org.greekwelfaresa.idempiere.test.assertj.ws_webservice.WS_WebServiceAssert.class, org.idempiere.webservices.model.X_WS_WebService.class, a);
	}

	default au.org.greekwelfaresa.idempiere.test.assertj.ws_webservice_para.WS_WebService_ParaAssert assertThat(org.idempiere.webservices.model.X_WS_WebService_Para a) {
		return proxy(au.org.greekwelfaresa.idempiere.test.assertj.ws_webservice_para.WS_WebService_ParaAssert.class, org.idempiere.webservices.model.X_WS_WebService_Para.class, a);
	}

	default au.org.greekwelfaresa.idempiere.test.assertj.ws_webservicefieldinput.WS_WebServiceFieldInputAssert assertThat(org.idempiere.webservices.model.X_WS_WebServiceFieldInput a) {
		return proxy(au.org.greekwelfaresa.idempiere.test.assertj.ws_webservicefieldinput.WS_WebServiceFieldInputAssert.class, org.idempiere.webservices.model.X_WS_WebServiceFieldInput.class, a);
	}

	default au.org.greekwelfaresa.idempiere.test.assertj.ws_webservicefieldoutput.WS_WebServiceFieldOutputAssert assertThat(org.idempiere.webservices.model.X_WS_WebServiceFieldOutput a) {
		return proxy(au.org.greekwelfaresa.idempiere.test.assertj.ws_webservicefieldoutput.WS_WebServiceFieldOutputAssert.class, org.idempiere.webservices.model.X_WS_WebServiceFieldOutput.class, a);
	}

	default au.org.greekwelfaresa.idempiere.test.assertj.ws_webservicemethod.WS_WebServiceMethodAssert assertThat(org.idempiere.webservices.model.X_WS_WebServiceMethod a) {
		return proxy(au.org.greekwelfaresa.idempiere.test.assertj.ws_webservicemethod.WS_WebServiceMethodAssert.class, org.idempiere.webservices.model.X_WS_WebServiceMethod.class, a);
	}

	default au.org.greekwelfaresa.idempiere.test.assertj.ws_webservicetype.WS_WebServiceTypeAssert assertThat(org.idempiere.webservices.model.X_WS_WebServiceType a) {
		return proxy(au.org.greekwelfaresa.idempiere.test.assertj.ws_webservicetype.WS_WebServiceTypeAssert.class, org.idempiere.webservices.model.X_WS_WebServiceType.class, a);
	}

	default au.org.greekwelfaresa.idempiere.test.assertj.ws_webservicetypeaccess.WS_WebServiceTypeAccessAssert assertThat(org.idempiere.webservices.model.X_WS_WebServiceTypeAccess a) {
		return proxy(au.org.greekwelfaresa.idempiere.test.assertj.ws_webservicetypeaccess.WS_WebServiceTypeAccessAssert.class, org.idempiere.webservices.model.X_WS_WebServiceTypeAccess.class, a);
	}
}