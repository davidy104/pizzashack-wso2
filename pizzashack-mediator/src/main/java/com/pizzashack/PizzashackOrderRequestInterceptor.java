package com.pizzashack;

import org.apache.axiom.soap.SOAPBody;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PizzashackOrderRequestInterceptor extends AbstractMediator {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(PizzashackOrderRequestInterceptor.class);

	public boolean mediate(MessageContext context) {
		LOGGER.info("PizzashackOrderRequestInterceptor start:{} ");
		LOGGER.info("MessageContext:{} ", context);
		String messageId = context.getMessageID();
		LOGGER.info("messageId:{} ", messageId);

		SOAPBody soapBody = context.getEnvelope().getBody();
		String bodyStr = soapBody.getText();
		LOGGER.info("soapBody:{} ", bodyStr);

		LOGGER.info("PizzashackOrderRequestInterceptor end:{} ");
		return true;
	}

}
