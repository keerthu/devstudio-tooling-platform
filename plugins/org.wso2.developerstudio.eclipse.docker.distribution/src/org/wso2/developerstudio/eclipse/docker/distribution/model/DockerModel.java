/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.docker.distribution.model;

import org.wso2.developerstudio.eclipse.docker.distribution.utils.DockerProjectConstants;
import org.wso2.developerstudio.eclipse.platform.core.exception.ObserverFailedException;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

/**
 * Model class for the docker project type. Additional properties ( docker tag,
 * docker repository )
 */
public class DockerModel extends ProjectDataModel {

    public boolean setModelPropertyValue(String key, Object data) throws ObserverFailedException {
        super.setModelPropertyValue(key, data);
        if (key.equalsIgnoreCase(DockerProjectConstants.DOCKER_TAG_KEY)) {
            setDockerTargetTag(data.toString());
        } else if (key.equalsIgnoreCase(DockerProjectConstants.DOCKER_REPOSITORY_KEY)) {
            setDockerTargetRepository(data.toString());
        } else if (key.equalsIgnoreCase(DockerProjectConstants.DOCKER_REMOTE_REPOSITORY_KEY)) {
            setDockerRemoteRepository(data.toString());
        } else if (key.equalsIgnoreCase(DockerProjectConstants.DOCKER_REMOTE_TAG_KEY)) {
            setDockerRemoteTag(data.toString());
        } else if (key.equalsIgnoreCase(DockerProjectConstants.KUBE_CONTAINER_NAME)) {
            setKubeContainerName(data.toString());
        } else if (key.equalsIgnoreCase(DockerProjectConstants.KUBE_REPLICAS)) {
            setKubeReplicsas(data.toString());
        } else if (key.equalsIgnoreCase(DockerProjectConstants.KUBE_REMOTE_REPOSITORY)) {
            setKubeRemoteRepository(data.toString());
        } else if (key.equalsIgnoreCase(DockerProjectConstants.KUBE_REMOTE_TAG)) {
            setKubeRemoteTag(data.toString());
        } else if (key.equalsIgnoreCase(DockerProjectConstants.KUBE_TARGET_REPOSITORY)) {
            setKubeTargetRepository(data.toString());
        } else if (key.equalsIgnoreCase(DockerProjectConstants.KUBE_TARGET_TAG)) {
            setKubeTargetTag(data.toString());
        } else if (key.equalsIgnoreCase(DockerProjectConstants.KUBE_EXPOSE_PORT)) {
            setKubeExposePort(data.toString());
        }
        return false;
    }
}
