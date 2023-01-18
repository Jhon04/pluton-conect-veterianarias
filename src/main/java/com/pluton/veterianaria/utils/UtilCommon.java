package com.pluton.veterianaria.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class UtilCommon  {

	
	public static String cifrarBase64(byte[] data) {
		Base64.Encoder encoder = Base64.getEncoder();
		String b = encoder.encodeToString(data);
		return b;
	}

	public static byte[] descifrarBase64(String a) {
		Base64.Decoder decoder = Base64.getDecoder();
		return decoder.decode(a);
	}

	public static String cifrarBase64Obj(Object obj) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ObjectOutputStream os = new ObjectOutputStream(out);
		os.writeObject(obj);
		return cifrarBase64(out.toByteArray());
	}

	public static Object descifrarBase64Obj(String a) throws IOException, ClassNotFoundException {
		ByteArrayInputStream in = new ByteArrayInputStream(descifrarBase64(a));
		ObjectInputStream is = new ObjectInputStream(in);
		return is.readObject();
	}
	
	public static boolean isNull(Object... obj) {
		for (Object o : obj) {
			if (o == null)
				return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	public static boolean isNotNull(Object... obj) {
		if (!isNull(obj))
			return Boolean.TRUE;
		else
			return Boolean.FALSE;
	}
	

	
}
