/*
 * Copyright (C) 2013 Carbon Development
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.carbon.fibers.fragments.systemui;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Resources;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.carbon.fibers.R;
import com.carbon.fibers.preference.SettingsPreferenceFragment;
import com.carbon.fibers.Utils;


public class SystemUiSettings extends SettingsPreferenceFragment {

    private static final String BATTERY = "battery_options";
    private static final String CLOCK = "clock_options";
    private static final String GENERAL = "general_options";
    private static final String NAVIGATION = "navigation_options";
    private static final String NOTIFICATION = "notification_options";
    private static final String QUICKSETTINGS = "quicksettings_options";

    Preference mBatt;
    Preference mClock;
    Preference mGeneral;
    Preference mNavig;
    Preference mNotif;
    Preference mQs;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createCustomView();
    }

    private PreferenceScreen createCustomView() {
        PreferenceScreen prefSet = getPreferenceScreen();
        if (prefSet != null) {
            prefSet.removeAll();
        }

        addPreferencesFromResource(R.xml.systemui_settings);

        mBatt = (Preference) prefSet.findPreference(BATTERY);
        mClock = (Preference) prefSet.findPreference(CLOCK);
        mGeneral = (Preference) prefSet.findPreference(GENERAL);
        mNavig = (Preference) prefSet.findPreference(NAVIGATION);
        mNotif = (Preference) prefSet.findPreference(QUICKSETTINGS);
    }
}
