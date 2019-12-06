package com.newler.studymemory;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

import com.argusapm.android.api.ApmTask;
import com.argusapm.android.api.Client;
import com.argusapm.android.core.Config;
import com.argusapm.android.network.cloudrule.RuleSyncRequest;
import com.argusapm.android.network.upload.CollectDataSyncUpload;

/**
 * @author 17173
 * @what
 * @date 2018/12/12
 */
public class BaseApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        Config.ConfigBuilder builder = new Config.ConfigBuilder()
                .setAppContext(this)
                .setRuleRequest(new RuleSyncRequest())
                .setUpload(new CollectDataSyncUpload())
                .setAppName(getString(R.string.app_name))
                .setAppVersion(BuildConfig.VERSION_NAME)
                .setApmid("u1tq36p1r0ji");
        Client.attach(builder.build());
        Client.startWork();
    }

}
