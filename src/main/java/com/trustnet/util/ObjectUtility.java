package com.trustnet.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ObjectUtility {
	
		//Reflection
		public static Map<String, Object> parameters(Object obj) {
	        Map<String, Object> map = new HashMap<>();
	        for (Field field : obj.getClass().getDeclaredFields()) {
	            field.setAccessible(true);
	            try { map.put(field.getName(), field.get(obj)); } catch (Exception e) { }
	        }
	        return map;
	    }

}
