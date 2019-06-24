package org.ccsl.gen.ocl.services.elementIdentifierService;


import java.util.HashMap;
import java.util.Map;

import ccsl.elements.Element;

public class ElementIdentifierService {
	private static int countId = 0;
	private static final Map<Element, Integer> ID_MAP = new HashMap<>();
	
	public static int getId(Element element) {
		Integer id = ID_MAP.get(element);
		if(id != null) {
			return id;
		}
		countId++;
		ID_MAP.put(element, countId);
		return countId;
	}
}