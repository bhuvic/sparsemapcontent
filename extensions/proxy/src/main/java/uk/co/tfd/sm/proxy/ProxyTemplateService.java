package uk.co.tfd.sm.proxy;

import java.io.Reader;
import java.io.Writer;
import java.util.Map;

public interface ProxyTemplateService {

	boolean evaluate(Map<String, Object> context, Writer writer,
			String logTag, String templateAsString);

	boolean evaluate(Map<String, Object> context, Writer writer,
			String logTag, Reader templateReader);

	boolean process(Map<String, Object> context, String encoding,
			Writer writer, String templateName);

	boolean checkTemplateExists(String templateName);

}
