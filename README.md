# News Summary Speech Library

This is a Java library for news summarization and text-to-speech conversion, published as `news-summary-speech` to GitHub Packages. The library provides interfaces for fetching news, generating summaries, and converting summaries to speech.

## Build System & Commands

**Build:** `./gradlew build`  
**Format code:** `./gradlew spotlessApply`  
**Check formatting:** `./gradlew spotlessCheck`  
**Publish:** `./gradlew publish` (requires GITHUB_ACTOR and GITHUB_TOKEN env vars)

## Architecture

The codebase follows a clean architecture with distinct layers:

### Core Domain Models (in `nss` package)
- **News:** Record containing title, description, URI, publishedDate, and category
- **Summary:** Complex record with structured content (paragraphs with URIs), metadata (dates, category, newsCount, generatedWith)
- **SummarySpeech:** Interface providing access to audio stream via `get()` method
- **Category:** Functional interface for news categorization

### Service Layer
- **Summarizer:** Functional interface that generates summaries from date range and category
- **SummarySpeechService:** Converts summaries to speech audio

### Repository Layer
- **NewsRepository, SummaryRepository, SummarySpeechRepository:** Data access interfaces

### Summary Structure
The Summary model uses nested records:
- `Summary.Content` contains a list of `Paragraph` records  
- Each `Paragraph` has content text and associated URIs for source attribution

## Development Environment

- **Java Version:** 21 (configured via toolchain)
- **Code Formatting:** Google Java Format via Spotless plugin
- **Build Tool:** Gradle with Kotlin DSL