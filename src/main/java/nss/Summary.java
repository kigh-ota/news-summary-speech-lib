package nss;

import java.util.Date;

public record Summary(String content, Date newestNewsDate, Date oldestNewDate, Category category) {}
