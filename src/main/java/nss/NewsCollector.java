package nss;

import java.io.IOException;
import java.util.List;

public interface NewsCollector {
  List<News> fetch() throws IOException;
}
