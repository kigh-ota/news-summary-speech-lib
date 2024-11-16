package nss;

import java.util.List;

public interface NewsSummaryRepository {
  void save(NewsSummary newsSummary);

  NewsSummary getLatest();

  List<NewsSummary> getRecent(int limit);
}
