package org.springframework.web.filter;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;

public class Sha512ShallowEtagHeaderFilter extends ShallowEtagHeaderFilter {

	protected String generateSha512ETagHeaderValue(byte[] contentAsByteArray) {
		final HashCode hash = Hashing.sha512().hashBytes(contentAsByteArray);
		return "\"" + hash + "\"";
	}
}
