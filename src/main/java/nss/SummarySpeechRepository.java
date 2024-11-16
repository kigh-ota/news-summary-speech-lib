package nss;

public interface SummarySpeechRepository {
  void save(SummarySpeech summarySpeech, Summary summary);

  SummarySpeech get(Summary summary);
}
