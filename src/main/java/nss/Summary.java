package nss;

import java.util.Date;
import java.util.List;

public record Summary(Content content, Date createdDate, Date oldestNewsDate, Category category) {
  public record Content(List<Paragraph> paragraphs) {
    public record Paragraph(String content, List<String> uris) {}
  }
}
