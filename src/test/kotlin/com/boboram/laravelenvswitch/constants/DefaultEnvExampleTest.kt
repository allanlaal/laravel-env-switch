package com.boboram.laravelenvswitch.constants

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DefaultEnvExampleTest {

    @Test
    fun testLaravelExampleTxt() {
        val expectedValue =  "APP_NAME=Laravel\nAPP_ENV=local\nAPP_KEY=\nAPP_DEBUG=true\nAPP_URL=http://localhost\n\nLOG_CHANNEL=stack\nLOG_DEPRECATIONS_CHANNEL=null\nLOG_LEVEL=debug\n\nDB_CONNECTION=mysql\nDB_HOST=127.0.0.1\nDB_PORT=3306\nDB_DATABASE=laravel\nDB_USERNAME=root\nDB_PASSWORD=\n\nBROADCAST_DRIVER=log\nCACHE_DRIVER=file\nFILESYSTEM_DRIVER=local\nQUEUE_CONNECTION=sync\nSESSION_DRIVER=file\nSESSION_LIFETIME=120\n\nMEMCACHED_HOST=127.0.0.1\n\nREDIS_HOST=127.0.0.1\nREDIS_PASSWORD=null\nREDIS_PORT=6379\n\nMAIL_MAILER=smtp\nMAIL_HOST=mailhog\nMAIL_PORT=1025\nMAIL_USERNAME=null\nMAIL_PASSWORD=null\nMAIL_ENCRYPTION=null\nMAIL_FROM_ADDRESS=null\nMAIL_FROM_NAME=\"\${APP_NAME}\"\n\nAWS_ACCESS_KEY_ID=\nAWS_SECRET_ACCESS_KEY=\nAWS_DEFAULT_REGION=us-east-1\nAWS_BUCKET=\nAWS_USE_PATH_STYLE_ENDPOINT=false\n\nPUSHER_APP_ID=\nPUSHER_APP_KEY=\nPUSHER_APP_SECRET=\nPUSHER_APP_CLUSTER=mt1\n\nMIX_PUSHER_APP_KEY=\"\${PUSHER_APP_KEY}\"\nMIX_PUSHER_APP_CLUSTER=\"\${PUSHER_APP_CLUSTER}\""
        val actualValue = DefaultEnvExample.laravelEnv

        println(actualValue)
        assertEquals(expectedValue, actualValue)


    }
}