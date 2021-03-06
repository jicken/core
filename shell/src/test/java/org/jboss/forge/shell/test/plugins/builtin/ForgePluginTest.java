/*
 * JBoss, by Red Hat.
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.forge.shell.test.plugins.builtin;

import org.jboss.arquillian.junit.Arquillian;
import org.jboss.forge.shell.Shell;
import org.jboss.forge.shell.ShellImpl;
import org.jboss.forge.test.AbstractShellTest;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 */
@RunWith(Arquillian.class)
public class ForgePluginTest extends AbstractShellTest
{
   @Test
   public void testFindPlugin() throws Exception
   {
      queueInputLines("y");
      Shell shell = getShell();
      shell.getEnvironment().setProperty(ShellImpl.PROP_DEFAULT_PLUGIN_REPO, ShellImpl.DEFAULT_PLUGIN_REPO);
      shell.execute("forge find-plugin jsf");
   }

   @Test
   public void testLogo() throws Exception
   {
      getShell().execute("forge");
   }

   @Ignore
   @Test
   public void testBuildSwitchyard() throws Exception
   {
      getShell().execute("forge source-plugin ~/Projects/forge/plugins/switchyard-core/tools/forge/plugin");
   }

}
