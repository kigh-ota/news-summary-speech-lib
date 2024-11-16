package nss;

import java.util.Date;
import java.util.List;

public interface NewsRepository {
  // Returns number of insertions
  int saveAll(List<News> newsList);

  // Retrieve all when null
  List<News> listPublishedAfter(Date date);
}
