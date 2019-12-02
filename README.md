# timings-client

This is a Java client for the [GoDaddy/timings](https://github.com/godaddy/timings) application. It was developed against the [timings-docker](https://github.com/Verkurkie/timings-docker) containers.

## Assumptions
- Installed Java [JDK8](http://www.oracle.com/technetwork/java/javase/downloads/index.html).
- Installed [IntelliJ Community Edition](https://www.jetbrains.com/idea/).

## When you have IntelliJ
- Import as a Maven project.

## Rest Assured
- See http://stackoverflow.com/questions/3375307/how-to-disable-code-formatting-for-some-part-of-the-code-using-comments

## Including in a Java Project
- Build it locally using `mvn package`.
- Publish it to your local Maven repository using [this](https://maven.apache.org/guides/mini/guide-3rd-party-jars-local.html).
    - Example: `mvn install:install-file -Dfile=./target/timings-client-1.0-SNAPSHOT.jar -DpomFile=pom.xml`
- Or you can add the dependency to your Maven POM.
```xml
<dependency>
    <groupId>com.kevingann</groupId>
    <artifactId>timings-client</artifactId>
    <version>0.7-SNAPSHOT</version>
</dependency>
```

## InjectJS Object

The [GoDaddy/timings](https://github.com/godaddy/timings) application leverages the [Web Performance API](https://developer.mozilla.org/en-US/docs/Web/API/Performance) available in most browsers.

Here's an example of what's being injected to obtain performance data.
```javascript
var visualCompleteTime = 0;
  if (performance.getEntriesByName('initialPageLoad').length) {
      visualCompleteTime = parseInt(performance.getEntriesByName('initialPageLoad')[0].startTime);
      window.performance.clearMarks();
  };
  return {
      time:new Date().getTime(),
      timing:window.performance.timing,
      visualCompleteTime: visualCompleteTime,
      url: document.location.href,
      resources: window.performance.getEntriesByType('resource')
  };
```

## NavigationTimingResponse Object

Refer to [Web Performance API](https://developer.mozilla.org/en-US/docs/Web/API/PerformanceTiming) to understand the data being returned.

## Release Errors

### gpg: signing failed: No secret key
- `mvn clean deploy` fails with the error message "gpg: signing failed: No secret key".
- See [this](https://stackoverflow.com/questions/29885887/gpg-no-default-secret-key-error-using-maven) article that describes how to update an expired gpg key.
