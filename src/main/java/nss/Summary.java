package nss;

import java.util.Date;

public record Summary(String content, Date createdDate, Date oldestNewDate, Category category) {}
