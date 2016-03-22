[![Build Status](https://travis-ci.org/synapticloop/taglibs.svg?branch=master)](https://travis-ci.org/synapticloop/taglibs) [![Download](https://api.bintray.com/packages/synapticloop/maven/taglibs/images/download.svg)](https://bintray.com/synapticloop/maven/taglibs/_latestVersion) [![GitHub Release](https://img.shields.io/github/release/synapticloop/taglibs.svg)](https://github.com/synapticloop/taglibs/releases) 

# taglibs



> Utility tag-libraries


# Tag Libraries

Tag libraries for various things

## Setup

Include the tag library

```
<%@ taglib uri="http://synapticloop.com/taglibs"  prefix="sutl" %>
```

## CopyrightDateTag

```
<sutl:copyrightDate startDate="2016" separator=" - " />
```


# Building the Package

## *NIX/Mac OS X

From the root of the project, simply run

`./gradlew build`


## Windows

`./gradlew.bat build`


This will compile and assemble the artefacts into the `build/libs/` directory.

Note that this may also run tests (if applicable see the Testing notes)

# Running the Tests

## *NIX/Mac OS X

From the root of the project, simply run

`gradle --info test`

if you do not have gradle installed, try:

`gradlew --info test`

## Windows

From the root of the project, simply run

`gradle --info test`

if you do not have gradle installed, try:

`./gradlew.bat --info test`


The `--info` switch will also output logging for the tests

# Artefact Publishing - Github

This project publishes artefacts to [GitHib](https://github.com/)

> Note that the latest version can be found [https://github.com/synapticloop/taglibs/releases](https://github.com/synapticloop/taglibs/releases)

As such, this is not a repository, but a location to download files from.

# Dependency Management Maven

This project publishes artefacts to [Maven Central](https://search.maven.org/)

> Note that the latest version can be found [mvn central](http://search.maven.org/#artifactdetails|synapticloop|taglibs|1.0.3|jar)

## maven setup

No setup is required

## gradle setup

Repository

```
repositories {
	mavenCentral()
}
```

## Dependencies - Gradle

```
dependencies {
	runtime(group: 'synapticloop', name: 'taglibs', version: '1.0.3', ext: 'jar')

	compile(group: 'synapticloop', name: 'taglibs', version: '1.0.3', ext: 'jar')
}
```

or, more simply for versions of gradle greater than 2.1

```
dependencies {
	runtime 'synapticloop:taglibs:1.0.3'

	compile 'synapticloop:taglibs:1.0.3'
}
```

## Dependencies - Maven

```
<dependency>
	<groupId>synapticloop</groupId>
	<artifactId>taglibs</artifactId>
	<version>1.0.3</version>
	<type>jar</type>
</dependency>
```

## Dependencies - Downloads


You will also need to download the following dependencies:



### cobertura dependencies

  - net.sourceforge.cobertura:cobertura:2.1.1: (It may be available on one of: [bintray](https://bintray.com/net.sourceforge.cobertura/maven/cobertura/2.1.1/view#files/net.sourceforge.cobertura/cobertura/2.1.1) [mvn central](http://search.maven.org/#artifactdetails|net.sourceforge.cobertura|cobertura|2.1.1|jar))


### compile dependencies

  - javax.servlet.jsp:jsp-api:2.2: (It may be available on one of: [bintray](https://bintray.com/javax.servlet.jsp/maven/jsp-api/2.2/view#files/javax.servlet.jsp/jsp-api/2.2) [mvn central](http://search.maven.org/#artifactdetails|javax.servlet.jsp|jsp-api|2.2|jar))


### testCompile dependencies

  - junit:junit:4.12: (It may be available on one of: [bintray](https://bintray.com/junit/maven/junit/4.12/view#files/junit/junit/4.12) [mvn central](http://search.maven.org/#artifactdetails|junit|junit|4.12|jar))
  - org.mockito:mockito-core:1.10.19: (It may be available on one of: [bintray](https://bintray.com/org.mockito/maven/mockito-core/1.10.19/view#files/org.mockito/mockito-core/1.10.19) [mvn central](http://search.maven.org/#artifactdetails|org.mockito|mockito-core|1.10.19|jar))
  - javax.servlet.jsp:jsp-api:2.2: (It may be available on one of: [bintray](https://bintray.com/javax.servlet.jsp/maven/jsp-api/2.2/view#files/javax.servlet.jsp/jsp-api/2.2) [mvn central](http://search.maven.org/#artifactdetails|javax.servlet.jsp|jsp-api|2.2|jar))
  - javax.servlet:javax.servlet-api:3.1.0: (It may be available on one of: [bintray](https://bintray.com/javax.servlet/maven/javax.servlet-api/3.1.0/view#files/javax.servlet/javax.servlet-api/3.1.0) [mvn central](http://search.maven.org/#artifactdetails|javax.servlet|javax.servlet-api|3.1.0|jar))
  - javax.el:javax.el-api:3.0.0: (It may be available on one of: [bintray](https://bintray.com/javax.el/maven/javax.el-api/3.0.0/view#files/javax.el/javax.el-api/3.0.0) [mvn central](http://search.maven.org/#artifactdetails|javax.el|javax.el-api|3.0.0|jar))
  - org.slf4j:slf4j-api:1.7.19: (It may be available on one of: [bintray](https://bintray.com/org.slf4j/maven/slf4j-api/1.7.19/view#files/org.slf4j/slf4j-api/1.7.19) [mvn central](http://search.maven.org/#artifactdetails|org.slf4j|slf4j-api|1.7.19|jar))


### testRuntime dependencies

  - junit:junit:4.12: (It may be available on one of: [bintray](https://bintray.com/junit/maven/junit/4.12/view#files/junit/junit/4.12) [mvn central](http://search.maven.org/#artifactdetails|junit|junit|4.12|jar))
  - org.mockito:mockito-core:1.10.19: (It may be available on one of: [bintray](https://bintray.com/org.mockito/maven/mockito-core/1.10.19/view#files/org.mockito/mockito-core/1.10.19) [mvn central](http://search.maven.org/#artifactdetails|org.mockito|mockito-core|1.10.19|jar))
  - javax.servlet.jsp:jsp-api:2.2: (It may be available on one of: [bintray](https://bintray.com/javax.servlet.jsp/maven/jsp-api/2.2/view#files/javax.servlet.jsp/jsp-api/2.2) [mvn central](http://search.maven.org/#artifactdetails|javax.servlet.jsp|jsp-api|2.2|jar))
  - javax.servlet:javax.servlet-api:3.1.0: (It may be available on one of: [bintray](https://bintray.com/javax.servlet/maven/javax.servlet-api/3.1.0/view#files/javax.servlet/javax.servlet-api/3.1.0) [mvn central](http://search.maven.org/#artifactdetails|javax.servlet|javax.servlet-api|3.1.0|jar))
  - javax.el:javax.el-api:3.0.0: (It may be available on one of: [bintray](https://bintray.com/javax.el/maven/javax.el-api/3.0.0/view#files/javax.el/javax.el-api/3.0.0) [mvn central](http://search.maven.org/#artifactdetails|javax.el|javax.el-api|3.0.0|jar))

**NOTE:** You may need to download any dependencies of the above dependencies in turn (i.e. the transitive dependencies)

# License

```
The MIT License (MIT)

Copyright (c) 2016 synapticloop

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```


--

> `This README.md file was hand-crafted with care utilising synapticloop`[`templar`](https://github.com/synapticloop/templar/)`->`[`documentr`](https://github.com/synapticloop/documentr/)

--

