package com.starter88.gspapivalidate.common.util;


import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.starter88.gspapivalidate.common.util.jaxb2.NullCharacterEscapeHandler;


public class ComUtil {
	
	private static final Logger log = LoggerFactory.getLogger(ComUtil.class);
	
	
	/**
	 * object 를 xml로 변경
	 * @param xmlVo
	 * @return
	 * @throws Exception
	 */
	public static String getObjectToXml(Object xmlVo) throws Exception{	    
		String xmlStr = "";
	    StringWriter xml = null;
		try{
		    JAXBContext jContext=JAXBContext.newInstance(xmlVo.getClass()); 
		    Marshaller marshaller=jContext.createMarshaller(); 
		    marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );
		    
		    xml = new StringWriter();
			marshaller.setProperty("com.sun.xml.bind.characterEscapeHandler", new NullCharacterEscapeHandler());

			marshaller.marshal(xmlVo, xml);
			xmlStr = xml.toString();
	    }finally{
	    	if(xml != null){
	    		xml.close();
	    	}
	    }
	    return xmlStr;
	}

}
