 <a name="#documentr_top"></a>[![Build Status](https://travis-ci.org/synapticloop/taglibs.svg?branch=master)](https://travis-ci.org/synapticloop/taglibs) [![Download](https://api.bintray.com/packages/synapticloop/maven/taglibs/images/download.svg)](https://bintray.com/synapticloop/maven/taglibs/_latestVersion) [![GitHub Release](https://img.shields.io/github/release/synapticloop/taglibs.svg)](https://github.com/synapticloop/taglibs/releases) 



<a name="documentr_heading_0"></a>

# taglibs <sup><sup>[top](#documentr_top)</sup></sup>



> Utility tag-libraries






<a name="documentr_heading_1"></a>

# Table of Contents <sup><sup>[top](#documentr_top)</sup></sup>



 - [taglibs](#documentr_heading_0)
 - [Table of Contents](#documentr_heading_1)
   - [Setup](#documentr_heading_2)
   - [CopyrightDateTag](#documentr_heading_3)
   - [RandomWordTag](#documentr_heading_4)
 - [Functions](#documentr_heading_5)
   - [urlEncode](#documentr_heading_6)
   - [urlDecode](#documentr_heading_7)
 - [Building the Package](#documentr_heading_8)
   - [*NIX/Mac OS X](#documentr_heading_9)
   - [Windows](#documentr_heading_10)
 - [Running the Tests](#documentr_heading_11)
   - [*NIX/Mac OS X](#documentr_heading_12)
   - [Windows](#documentr_heading_13)
 - [Artefact Publishing - Github](#documentr_heading_14)
 - [Dependency Management Maven](#documentr_heading_15)
   - [maven setup](#documentr_heading_16)
   - [gradle setup](#documentr_heading_17)
   - [Dependencies - Gradle](#documentr_heading_18)
   - [Dependencies - Maven](#documentr_heading_19)
   - [Dependencies - Downloads](#documentr_heading_20)
 - [License](#documentr_heading_25)


# Tag Libraries

Tag libraries for various things



<a name="documentr_heading_2"></a>

## Setup <sup><sup>[top](#documentr_top)</sup></sup>

Include the tag library



```
<%@ taglib uri="http://synapticloop.com/taglibs"  prefix="sutl" %>
```





<a name="documentr_heading_3"></a>

## CopyrightDateTag <sup><sup>[top](#documentr_top)</sup></sup>

To use the tag, just enter the start date (the separator attribute is optional)



```
Copyright (c) <sutl:copyrightDate startYear="2015" separator=" - " /> My Company. All rights reserved.
```



This will output



```
Copyright (c) 2015 - 2016 My Company. All rights reserved.
```



If the start date is empty or the current year, then only the current year is output, e.g.:



```
Copyright (c) 2016 My Company. All rights reserved.
```





<a name="documentr_heading_4"></a>

## RandomWordTag <sup><sup>[top](#documentr_top)</sup></sup>

This tag will output a random word from the passed in list of words, which are 
delimited by commas (').  The delimiter character can be entered as something else.



```
<sutl:randomWord words="hello,there,baby" />
```



Which will output one of 

  - `hello`, or
  - `there`, or
  - `baby`

Should you wish to use a different delimiter:



```
<sutl:randomWord words="hello§there§baby" delimiter="§" />
```



Which will again output one of 

  - `hello`, or
  - `there`, or
  - `baby`



<a name="documentr_heading_5"></a>

# Functions <sup><sup>[top](#documentr_top)</sup></sup>

Functions for various things



<a name="documentr_heading_6"></a>

## urlEncode <sup><sup>[top](#documentr_top)</sup></sup>



```
${sutl:urlEncode("some url")
```



which will output



```
some+url
```





<a name="documentr_heading_7"></a>

## urlDecode <sup><sup>[top](#documentr_top)</sup></sup>



```
${sutl:urlDecode("some+url")
```



which will output



```
some url
```






<a name="documentr_heading_8"></a>

# Building the Package <sup><sup>[top](#documentr_top)</sup></sup>



<a name="documentr_heading_9"></a>

## *NIX/Mac OS X <sup><sup>[top](#documentr_top)</sup></sup>

From the root of the project, simply run

`./gradlew build`




<a name="documentr_heading_10"></a>

## Windows <sup><sup>[top](#documentr_top)</sup></sup>

`./gradlew.bat build`


This will compile and assemble the artefacts into the `build/libs/` directory.

Note that this may also run tests (if applicable see the Testing notes)



<a name="documentr_heading_11"></a>

# Running the Tests <sup><sup>[top](#documentr_top)</sup></sup>



<a name="documentr_heading_12"></a>

## *NIX/Mac OS X <sup><sup>[top](#documentr_top)</sup></sup>

From the root of the project, simply run

`gradle --info test`

if you do not have gradle installed, try:

`gradlew --info test`



<a name="documentr_heading_13"></a>

## Windows <sup><sup>[top](#documentr_top)</sup></sup>

From the root of the project, simply run

`gradle --info test`

if you do not have gradle installed, try:

`./gradlew.bat --info test`


The `--info` switch will also output logging for the tests



<a name="documentr_heading_14"></a>

# Artefact Publishing - Github <sup><sup>[top](#documentr_top)</sup></sup>

This project publishes artefacts to [GitHub](https://github.com/)

> Note that the latest version can be found [https://github.com/synapticloop/taglibs/releases](https://github.com/synapticloop/taglibs/releases)

As such, this is not a repository, but a location to download files from.



<a name="documentr_heading_15"></a>

# Dependency Management Maven <sup><sup>[top](#documentr_top)</sup></sup>

This project publishes artefacts to [Maven Central](https://search.maven.org/)

> Note that the latest version can be found [mvn central](http://search.maven.org/#artifactdetails|synapticloop|taglibs|2.1.0|jar)



<a name="documentr_heading_16"></a>

## maven setup <sup><sup>[top](#documentr_top)</sup></sup>

No setup is required



<a name="documentr_heading_17"></a>

## gradle setup <sup><sup>[top](#documentr_top)</sup></sup>

Repository



```
repositories {
	mavenCentral()
}
```





<a name="documentr_heading_18"></a>

## Dependencies - Gradle <sup><sup>[top](#documentr_top)</sup></sup>



```
dependencies {
	runtime(group: 'synapticloop', name: 'taglibs', version: '2.1.0', ext: 'jar')

	compile(group: 'synapticloop', name: 'taglibs', version: '2.1.0', ext: 'jar')
}
```



or, more simply for versions of gradle greater than 2.1



```
dependencies {
	runtime 'synapticloop:taglibs:2.1.0'

	compile 'synapticloop:taglibs:2.1.0'
}
```





<a name="documentr_heading_19"></a>

## Dependencies - Maven <sup><sup>[top](#documentr_top)</sup></sup>



```
<dependency>
	<groupId>synapticloop</groupId>
	<artifactId>taglibs</artifactId>
	<version>2.1.0</version>
	<type>jar</type>
</dependency>
```





<a name="documentr_heading_20"></a>

## Dependencies - Downloads <sup><sup>[top](#documentr_top)</sup></sup>


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



<a name="documentr_heading_25"></a>

# License <sup><sup>[top](#documentr_top)</sup></sup>



```
The MIT License (MIT)

Copyright (c) 2017 synapticloop

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
