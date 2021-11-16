JWebAssembly-API
======

[![Build Status](https://api.travis-ci.com/i-net-software/JWebAssembly-API.svg)](https://app.travis-ci.com/github/i-net-software/JWebAssembly-API)
[![License](https://img.shields.io/github/license/i-net-software/jwebassembly-api.svg)](https://github.com/i-net-software/jwebassembly-api/blob/master/LICENSE.txt)
[![Maven](https://img.shields.io/maven-central/v/de.inetsoftware/jwebassembly-api.svg)](https://mvnrepository.com/artifact/de.inetsoftware/jwebassembly-api)
[![JitPack](https://jitpack.io/v/i-net-software/jwebassembly-api.svg)](https://jitpack.io/#i-net-software/jwebassembly-api/master-SNAPSHOT)

This is a possible API of JWebAssembly for the browser. If you want to use it, you must add it as a compile-time dependency to your Java project.

```gradle
repositories {
     mavenCentral()
}
dependencies {
    compile 'de.inetsoftware:jwebassembly-api:+'
}
```

This library contains:
* the Java annotations that control the compiler.
* some native methods of the Java VM. The pure compiler JWebAssembly does not know how to replace native code and fire an error if a native method is references without an replacement.
* the emulator to debug your code in your Java IDE.
* a wrapper for the DOM and the JavaScript API.

It is possible to use another library with another target for your. For example for command line tool which can do file access. Or you think the concept of the DOM API wrapper is to pure. If you write your alternative library or fork this then only the annotations must be identical for the compiler JWebAssembly.


Documentation
----
The documentation of JWebAssembly and the usage of this library can be found in the [wiki](https://github.com/i-net-software/JWebAssembly/wiki).
