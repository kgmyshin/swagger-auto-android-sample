SCRIPT_DIR=$(cd $(dirname $0); pwd)
echo $SCRIPT_DIR
rm $SCRIPT_DIR/swagger.json

$SCRIPT_DIR/swagger-kotlin-codegen/gradlew -b $SCRIPT_DIR/swagger-kotlin-codegen/build.gradle jar
wget https://kgmyshin.github.io/swagger-auto-server-sample/swagger.json -O $SCRIPT_DIR/swagger.json
java -jar $SCRIPT_DIR/swagger-kotlin-codegen/build/libs/swagger-kotlin-codegen-1.0-SNAPSHOT.jar  generate -i $SCRIPT_DIR/swagger.json -l com.kgmyshin.swagger.codgen.kotlin.PokoGenConfig -t $SCRIPT_DIR/kotlin-client --model-package com.kgmyshin.swagger.sample.api.json --model-name-suffix Json -o $SCRIPT_DIR/dist

find $SCRIPT_DIR/../src/main/kotlin/com/kgmyshin/swagger/sample/api/json | grep -v -E '/internal/' | grep "Json.kt" | xargs rm
cp -r $SCRIPT_DIR/dist/src/main/kotlin/com/kgmyshin/swagger/sample/api/json $SCRIPT_DIR/../src/main/kotlin/com/kgmyshin/swagger/sample/api

rm -rf $SCRIPT_DIR/dist



