package com.starter88.gspapivalidate.common.util.jaxb2;

import java.io.IOException;
import java.io.Writer;

import com.sun.xml.bind.marshaller.CharacterEscapeHandler;

public class NullCharacterEscapeHandler implements CharacterEscapeHandler {

    public NullCharacterEscapeHandler() {
        super();
    }

	@Override
    public void escape( char[] ac, int i, int j, boolean flag, Writer writer ) throws IOException{   
		// do not escape   
		writer.write( ac, i, j );   
    }
}
