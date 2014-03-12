package com.pizzashack;

import org.apache.axiom.soap.SOAPBody;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PizzashackSearchByIdSendMediator extends AbstractMediator {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(PizzashackSearchByIdSendMediator.class);

	public boolean mediate(MessageContext context) {
		LOGGER.info("PizzashackSearchByIdSendMediator start:{} ");
		LOGGER.info("MessageContext:{} ", context);

		// SynapseConfiguration config = context.getConfiguration();
		// LOGGER.info("config:{} ", config);

		String messageId = context.getMessageID();
		LOGGER.info("messageId:{} ", messageId);

		SOAPBody soapBody = context.getEnvelope().getBody();
		String bodyStr = soapBody.getText();
		LOGGER.info("soapBody:{} ", bodyStr);

		context.setProperty("testProperty", "this prop is before send");
		LOGGER.info("PizzashackSearchByIdSendMediator end:{} ");
		return true;
	}
}
