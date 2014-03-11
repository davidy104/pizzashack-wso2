package com.pizzashack;

import org.apache.synapse.MessageContext;
import org.apache.synapse.config.SynapseConfiguration;
import org.apache.synapse.mediators.AbstractMediator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PizzashackSearchByIdRecieveMediator extends AbstractMediator {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(PizzashackSearchByIdRecieveMediator.class);

	public boolean mediate(MessageContext context) {
		LOGGER.info("PizzashackSearchByIdRecieveMediator start:{} ");
		LOGGER.info("MessageContext:{} ", context);
		SynapseConfiguration config = context.getConfiguration();
		LOGGER.info("config:{} ", config);

		String messageId = context.getMessageID();
		LOGGER.info("messageId:{} ", messageId);

		String prop = (String) context.getProperty("testProperty");
		LOGGER.info("get testProperty:{} ", prop);

		LOGGER.info("PizzashackSearchByIdRecieveMediator end:{} ");
		return true;
	}

}
