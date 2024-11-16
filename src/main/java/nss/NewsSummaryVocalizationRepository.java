package nss;

import java.io.IOException;
import java.io.InputStream;

public interface NewsSummaryVocalizationRepository {
  void save(InputStream is, NewsSummary newsSummary) throws IOException;

  InputStream get(NewsSummary newsSummary) throws IOException;
}
