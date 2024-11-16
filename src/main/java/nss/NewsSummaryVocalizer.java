package nss;

import java.io.IOException;
import java.io.InputStream;

public interface NewsSummaryVocalizer {
  InputStream vocalize(NewsSummary newsSummary) throws IOException;
}
