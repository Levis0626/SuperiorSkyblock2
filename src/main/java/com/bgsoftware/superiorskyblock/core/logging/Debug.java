package com.bgsoftware.superiorskyblock.core.logging;

import java.util.Locale;

public enum Debug {

    CREATE_ISLAND,
    DELETE_ISLAND,
    SORT_ISLANDS,
    CALCULATE_ALL_ISLANDS,
    PURGE_ISLAND,
    UNPURGE_ISLAND,
    REGISTER_SORTING_TYPE,
    SET_LAST_ISLAND,
    SET_BLOCK_AMOUNT,
    GET_VALUE,
    SAVE_SCHEMATIC,
    REWARD_MISSION,
    EXECUTE_COMMAND,
    INVITE_MEMBER,
    REVOKE_INVITE,
    ADD_MEMBER,
    KICK_MEMBER,
    BAN_PLAYER,
    UNBAN_PLAYER,
    ADD_COOP,
    REMOVE_COOP,
    SET_COOP_LIMIT,
    ENTER_ISLAND,
    LEAVE_ISLAND,
    SET_ISLAND_HOME,
    SET_VISITOR_HOME,
    SET_NORMAL_ENABLED,
    SET_NETHER_ENABLED,
    SET_END_ENABLED,
    SET_PERMISSION,
    RESET_PERMISSIONS,
    SET_NAME,
    SET_DESCRIPTION,
    TRANSFER_ISLAND,
    CALCULATE_ISLAND,
    UPDATE_BORDER,
    SET_SIZE,
    SET_DISCORD,
    SET_PAYPAL,
    SET_BIOME,
    SET_IGNORED,
    SEND_MESSAGE,
    SEND_TITLE,
    SET_LOCKED,
    EXECUTE_ISLAND_COMMANDS,
    SET_ISLAND_LAST_TIME_UPDATED,
    SET_BANK_LIMIT,
    GIVE_BANK_INTEREST,
    SET_BONUS_WORTH,
    SET_BONUS_LEVEL,
    SET_UPGRADE,
    SET_CROP_GROWTH,
    SET_SPAWNER_RATES,
    SET_MOB_DROPS,
    CLEAR_BLOCK_LIMITS,
    SET_BLOCK_LIMIT,
    REMOVE_BLOCK_LIMIT,
    CLEAR_ENTITY_LIMITS,
    SET_ENTITY_LIMIT,
    SET_TEAM_LIMIT,
    SET_WARPS_LIMIT,
    SET_ISLAND_EFFECT,
    REMOVE_ISLAND_EFFECT,
    CLEAR_ISLAND_EFFECTS,
    SET_ROLE_LIMIT,
    REMOVE_ROLE_LIMIT,
    CREATE_WARP_CATEGORY,
    DELETE_WARP_CATEGORY,
    CREATE_WARP,
    DELETE_WARP,
    SET_RATING,
    REMOVE_RATING,
    REMOVE_RATINGS,
    ENABLE_ISLAND_FLAG,
    DISABLE_ISLAND_FLAG,
    SET_GENERATOR_PERCENTAGE,
    SET_GENERATOR_RATE,
    REMOVE_GENERATOR_RATE,
    CLEAR_GENERATOR_RATES,
    GENERATE_BLOCK,
    SET_SCHEMATIC,
    SET_ISLAND_MISSION_COMPLETED,
    DATABASE_QUERY,
    MENU_CLICK,
    OPEN_MENU,
    BLOCK_PLACE,
    BLOCK_BREAK,
    BLOCK_COUNT_INCREASE,
    BLOCK_COUNT_DECREASE,
    CHUNK_CALCULATION,
    ENTITY_SPAWN,
    ENTITY_DESPAWN,
    DEPOSIT_MONEY,
    WITHDRAW_MONEY,
    SET_TEXTURE_VALUE,
    SET_PLAYER_LAST_TIME_UPDATED,
    SET_PLAYER_ISLAND,
    SET_PLAYER_ROLE,
    SET_DISBANDS,
    SET_LANGUAGE,
    SET_TOGGLED_BORDER,
    SET_TOGGLED_STACKER,
    SET_TOGGLED_SCHEMATIC,
    SET_TEAM_CHAT,
    SET_ADMIN_BYPASS,
    SET_TOGGLED_PANEL,
    SET_ISLAND_FLY,
    SET_ADMIN_SPY,
    SET_BORDER_COLOR,
    SET_SCHEMATIC_POSITION,
    SET_PLAYER_STATUS,
    REMOVE_PLAYER_STATUS,
    SET_PLAYER_MISSION_COMPLETED,
    SET_WARP_NAME,
    SET_WARP_LOCATION,
    SET_WARP_PRIVATE,
    SET_WARP_ICON,
    SET_WARP_CATEGORY_NAME,
    SET_WARP_CATEGORY_ICON,
    SET_WARP_CATEGORY_SLOT,
    VOID_TELEPORT,
    TELEPORT_PLAYER,
    LOAD_CHUNK,
    PASTE_SCHEMATIC,
    FIRE_EVENT,
    FIND_SAFE_TELEPORT,
    PERMISSION_LOOKUP,
    REPLACE_PLAYER,

    SHOW_STACKTRACE,
    PROFILER;

    private static String[] DEBUG_NAMES = null;

    public static String[] getDebugNames() {
        if (DEBUG_NAMES == null) {
            Debug[] debugs = Debug.values();
            DEBUG_NAMES = new String[debugs.length];
            for (int i = 0; i < debugs.length; ++i)
                DEBUG_NAMES[i] = debugs[i].name().toLowerCase(Locale.ENGLISH);
        }

        return DEBUG_NAMES;
    }
}
