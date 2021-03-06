/*
 * Copyright 2015 Priyesh Patel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.chromium.fontinstaller;

import com.chromium.fontinstaller.ui.backuprestore.BackupRestoreFragment;
import com.chromium.fontinstaller.ui.fontlist.FontListFragment;
import com.chromium.fontinstaller.ui.install.FontActivity;
import com.chromium.fontinstaller.ui.install.PromptBackupDialog;
import com.chromium.fontinstaller.ui.settings.SettingsFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = FontsterModule.class)
public interface FontsterComponent {
  void inject(SettingsFragment settingsFragment);
  void inject(BackupRestoreFragment backupRestoreFragment);
  void inject(FontListFragment fontListFragment);
  void inject(FontActivity fontActivity);
  void inject(PromptBackupDialog promptBackupDialog);
}