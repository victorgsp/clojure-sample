#!/usr/bin/env bash

lein with-profiles +native-image "do" clean, uberjar

native-image \
    -jar target/uberjar/*-standalone.jar \
    -H:Name=clojure-sample \
    -J-Dclojure.compiler.direct-linking=true \
    -J-Dclojure.spec.skip-macros=true \
    -H:+ReportExceptionStackTraces \
    -H:Log=registerResource: \
    --verbose \
    -H:IncludeResources="db/.*|static/.*|templates/.*|.*.yml|.*.xml|.*/org/sqlite/.*|org/sqlite/.*" \
    -H:ReflectionConfigurationFiles=graalvm_config.json \
    --initialize-at-build-time  \
    --report-unsupported-elements-at-runtime \
    --no-server \
    --no-fallback

    # -H:+AllowIncompleteClasspath \
    # -H:JNIConfigurationFiles=graalvm_jni_config.json \
