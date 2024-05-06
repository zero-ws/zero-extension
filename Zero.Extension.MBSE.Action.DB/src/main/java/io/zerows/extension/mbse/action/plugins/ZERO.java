package io.zerows.extension.mbse.action.plugins;

import io.horizon.uca.cache.Cc;
import io.zerows.extension.mbse.action.uca.aim.JtAim;

import java.util.HashSet;
import java.util.Set;

interface Pool {

    Cc<String, JtAim> CC_AIM = Cc.openThread();

    // Address
    Set<Class<?>> WORKER_SET = new HashSet<>();
    Set<Class<?>> WORKER_JS_SET = new HashSet<>();
}
