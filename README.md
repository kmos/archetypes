# Base Maven Archetype

A base maven archetype to quickly start a project

## Getting Started

A simple base archetype useful to start quick projects with few dependencies and a good
folder organization.

## Project Structure

```
├── CONTRIBUTORS.md
├── LICENSE.md
├── pom.xml
├── README.md
└── src
    ├── main
    │   ├── java
    │   │   └── io
    │   │       └── groupId
    │   │           └── Application.java
    │   └── resources
    │       └── io
    │           └── groupId
    └── test
        ├── java
        │   └── io
        │       └── groupId
        │           └── ApplicationTest.java
        └── resources
            └── io
                └── groupId
```

## Dependencies

```
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.3.1</version>
        <scope>test</scope>
    </dependency>
```

### Prerequisites

* [Maven](https://maven.apache.org/) - Dependency Management
* Java >= 8

### Installing

This archetype is distributed using [jtpack.io](https://jitpack.io/). To use it,
please follow [instructions](https://jitpack.io/) and add jitpack repository:

```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

And then you can use it

```
mvn archetype:generate \
-DgroupId=io.myGroupId \
-DartifactId=myArtifactId \
-DprojectName=myProjectName \
-DarchetypeGroupId=com.github.kmos \
-DarchetypeArtifactId=basestart \
-DarchetypeVersion=1.0 
```

## Development

You can modify and improve it following guidelines to build a [maven archetype](https://maven.apache.org/guides/mini/guide-creating-archetypes.html)

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Giovanni Panice** - *BMC Software* - [mosfet.io](https://mosfet.io)

See also the list of [contributors](CONTRIBUTORS.md) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

