/*
 * Copyright 2017 Duncan C.
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

package net.dunciboy.discord_bot.commands.anime_air_notifier;

import net.dunciboy.discord_bot.commands.CommandModule;

/**
 * Created by Duncan on 5/04/2017.
 */
public final class AnimeAirNotifierCommands {
    public static CommandModule[] createCommands() {

        return new CommandModule[]{
                new AnimeAirNotificationDataManager(),
                new AnimeList(),
                new RemoveSubscriptionFromAnime(),
                new SubscribeToAnime()
        };
    }
}
