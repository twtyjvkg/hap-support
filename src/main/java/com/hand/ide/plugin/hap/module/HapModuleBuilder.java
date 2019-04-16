package com.hand.ide.plugin.hap.module;

import com.intellij.ide.util.projectWizard.JavaModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleBuilderListener;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.projectRoots.Sdk;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * @Author: xuzhao
 * @Email: mailto:support@xuzhao.xin
 * @Description:
 * @Time: 2019/4/16 22:20
 */
public class HapModuleBuilder extends JavaModuleBuilder implements ModuleBuilderListener {

    private Sdk mySdk;

    public HapModuleBuilder() {
        addListener(this);
    }

    @Override
    public String getBuilderId() {
        return "hap";
    }

    @Override
    public Icon getNodeIcon() {
        return null;
    }

    @Override
    public void moduleCreated(@NotNull Module module) {

    }
}
