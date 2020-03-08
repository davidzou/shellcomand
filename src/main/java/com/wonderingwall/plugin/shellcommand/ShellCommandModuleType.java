package com.wonderingwall.plugin.shellcommand;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.module.ModuleTypeManager;
import icons.SCIcons;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ShellCommandModuleType extends ModuleType<ShellCommandModuleBuilder> {
    private static final String ID = "SHELL_COMMAND";

    public ShellCommandModuleType() {
        super(ID);
    }

    public static ShellCommandModuleType getInstance() {
        return (ShellCommandModuleType) ModuleTypeManager.getInstance().findByID(ID);
    }

    @NotNull
    @Override
    public ShellCommandModuleBuilder createModuleBuilder() {
        return new ShellCommandModuleBuilder();
    }

    @Nls(capitalization = Nls.Capitalization.Title)
    @NotNull
    @Override
    public String getName() {
        return "ShellCommand";
    }

    @Nls(capitalization = Nls.Capitalization.Sentence)
    @NotNull
    @Override
    public String getDescription() {
        return "";
    }

    @NotNull
    @Override
    public Icon getNodeIcon(boolean isOpened) {
        return SCIcons.LOGO_12;
    }
}
