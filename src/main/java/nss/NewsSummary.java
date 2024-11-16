package nss;

import java.util.Date;

public record NewsSummary(String content, Date createdDate) {
  public String contentWithoutURIs() {
    return content.replaceAll("<uri>.*</uri>", "");
  }
}
