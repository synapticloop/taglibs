# Tag Libraries

Tag libraries for various things

## Setup

Include the tag library

```
<%@ taglib uri="http://synapticloop.com/taglibs"  prefix="sutl" %>
```

## CopyrightDateTag

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

# Functions

Functions for various things

## urlEncode

```
${sutl:urlEncode("some url")
```

which will output

```
some+url
```

## urlDecode

```
${sutl:urlDecode("some+url")
```

which will output

```
some url
```
