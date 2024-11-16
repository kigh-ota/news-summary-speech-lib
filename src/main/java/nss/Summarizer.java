package nss;

import java.util.Date;
import java.util.List;

@FunctionalInterface
public interface Summarizer {
  Summary summarize(Date newestNewsDate, Date oldestNewDate, Category category);
}
