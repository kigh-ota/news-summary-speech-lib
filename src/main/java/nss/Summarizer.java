package nss;

import java.util.Date;

@FunctionalInterface
public interface Summarizer {
  Summary summarize(Date oldestNewsDate, Category category);
}
