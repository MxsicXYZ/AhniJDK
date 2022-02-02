# AhniJDK
[ ![Download](https://api.bintray.com/packages/adriantodt/maven/ahnijdk/images/download.svg) ](https://bintray.com/adriantodt/maven/ahnijdk/_latestVersion)

Java API for Ahni API v2

# Adding to your project

Maven:
```xml
<dependency>
  <groupId>com.github.mxsicxyz</groupId>
  <artifactId>ahnijdk</artifactId>
  <version>VERSION</version>
  <type>pom</type>
</dependency>
```
Gradle:
```gradle
compile 'com.github.mxsicxyz:ahnijdk:VERSION'
```

You can find the latest version [here](https://bintray.com/adriantodt/maven/ahnijdk)

# Usage

To get started, you need an instance of `AhniJDK`
```java
AhniJDK api = new AhniJDK.Builder().build();
```

## Images 

```java
ImageProvider imageProvider = api.getImageProvider();

//blocking call
Image image = imageProvider.getRandomImage("pat").execute();
try {
    //futures are supported too
    byte[] bytes = image.download().submit().get();
    System.out.println("Downloaded image " + image.getId() + ", with " + bytes.length + " bytes");
} catch(InterruptedException|ExecutionException e) {
    e.printStackTrace();
}
```

## Text 

```java
TextProvider textProvider = api.getTextProvider();

textProvider.owoifyText("hello, how are you?").async(text->{
    System.out.println("OwOified Text: " + text);
});

textProvider.getRandom8Ball().async(data->{
    System.out.println("8ball: " + data.getResponse());
});
```

Additional info can be found on the javadocs for the AhniJDK class and [on the official Discord server](https://discord.gg/BARzYz8).
