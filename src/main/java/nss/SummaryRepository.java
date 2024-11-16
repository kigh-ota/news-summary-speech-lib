package nss;

import java.util.List;

public interface SummaryRepository {
  void save(Summary summary);

  List<Summary> getRecents(int limit, Category category);
}
