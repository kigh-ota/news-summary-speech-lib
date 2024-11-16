package nss;

import java.util.List;

@FunctionalInterface
public interface Summarizer {
  Summary summarize(List<News> newsList);
}
