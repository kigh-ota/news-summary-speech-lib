package nss;

import java.io.InputStream;

public interface SummarySpeechRepository {
  void save(SummarySpeech summarySpeech, Summary summary);

  InputStream get(Summary summary);
}
