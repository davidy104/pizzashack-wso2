package com.pizzashack;

import javax.xml.XMLConstants;
import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.soap.SOAPBody;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPHeader;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PizzashackOrderRequestInterceptor extends AbstractMediator {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(PizzashackOrderRequestInterceptor.class);

	private static final QName REQUESTID_Q = new QName(
			XMLConstants.DEFAULT_NS_PREFIX, "messageId");

	public boolean mediate(MessageContext context) {
		LOGGER.info("PizzashackOrderRequestInterceptor start:{} ");
		LOGGER.info("MessageContext:{} ", context);
		String messageId = context.getMessageID();
		LOGGER.info("messageId:{} ", messageId);
//		SOAPEnvelope soapEnvelope = context.getEnvelope();
//		SOAPBody soapBody = soapEnvelope.getBody();
//		SOAPHeader soapHeader = soapEnvelope.getHeader();

//		OMElement requestId = soapHeader.getFirstChildWithName(REQUESTID_Q);
//		LOGGER.info("requestId:{} ", requestId.getText());
//		
//		context.setProperty("REQUEST_ID", requestId.getText());
		
//		String bodyStr = soapBody.getText();
//		LOGGER.info("soapBody:{} ", bodyStr);

		LOGGER.info("PizzashackOrderRequestInterceptor end:{} ");
		return true;
	}

}
