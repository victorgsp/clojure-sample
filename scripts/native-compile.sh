#!/usr/bin/env bash

lein with-profiles +native-image "do" clean, uberjar

native-image \
    -jar target/uberjar/*-standalone.jar \
    --initialize-at-build-time  \
    -H:Name=clojure-sample \
    -J-Dclojure.compiler.direct-linking=true \
    -J-Dclojure.spec.skip-macros=true \
    -H:+ReportExceptionStackTraces \
    -H:Log=registerResource: \
    -H:IncludeResources="db/.*|static/.*|templates/.*|.*.yml|.*.xml|.*/org/sqlite/.*|org/sqlite/.*" \
    --verbose \
    --report-unsupported-elements-at-runtime \
    -H:+ReportUnsupportedElementsAtRuntime \
    -H:ReflectionConfigurationFiles=graalvm_config.json \
    --no-server \
    --no-fallback


    # -Dfile.encoding=UTF-8 \
    # -H:ReflectionConfigurationFiles=graalvm_config.json \
    # -H:IncludeResources="db/.*|static/.*|templates/.*|.*.yml|.*.xml|.*/org/sqlite/.*|org/sqlite/.*" \
    # -H:EnableURLProtocols=http \
    # --allow-incomplete-classpath \
    # -H:ReflectionConfigurationFiles=graalvm_config.json \
    # --initialize-at-build-time=org.sqlite.JDBC \
    # --initialize-at-build-time=org.sqlite.core.DB\$ProgressObserver \
    # --initialize-at-build-time=org.sqlite.core.DB \
    # --initialize-at-build-time=org.sqlite.core.NativeDB \
    # --initialize-at-build-time=org.sqlite.ProgressHandler \
    # --initialize-at-build-time=org.sqlite.Function \
    # --initialize-at-build-time=org.sqlite.Function\$Aggregate \
    # --initialize-at-build-time=org.sqlite.Function\$Window \
