/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.models;

import com.microsoft.azure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Iterator;

/**
* The List Locations operation response.
*/
public class LocationsListResponse extends OperationResponse implements Iterable<LocationsListResponse.Location> {
    private ArrayList<LocationsListResponse.Location> locations;
    
    /**
    * Optional. The data center locations that are valid for your subscription.
    * @return The Locations value.
    */
    public ArrayList<LocationsListResponse.Location> getLocations() {
        return this.locations;
    }
    
    /**
    * Optional. The data center locations that are valid for your subscription.
    * @param locationsValue The Locations value.
    */
    public void setLocations(final ArrayList<LocationsListResponse.Location> locationsValue) {
        this.locations = locationsValue;
    }
    
    /**
    * Initializes a new instance of the LocationsListResponse class.
    *
    */
    public LocationsListResponse() {
        super();
        this.setLocations(new ArrayList<LocationsListResponse.Location>());
    }
    
    /**
    * Gets the sequence of Locations.
    *
    */
    public Iterator<LocationsListResponse.Location> iterator() {
        return this.getLocations().iterator();
    }
    
    /**
    * A data center location that is valid for your subscription.
    */
    public static class Location {
        private ArrayList<String> availableServices;
        
        /**
        * Optional. Indicates the services available at a location.
        * @return The AvailableServices value.
        */
        public ArrayList<String> getAvailableServices() {
            return this.availableServices;
        }
        
        /**
        * Optional. Indicates the services available at a location.
        * @param availableServicesValue The AvailableServices value.
        */
        public void setAvailableServices(final ArrayList<String> availableServicesValue) {
            this.availableServices = availableServicesValue;
        }
        
        private ComputeCapabilities computeCapabilities;
        
        /**
        * Optional. The compute capabilities in this location.
        * @return The ComputeCapabilities value.
        */
        public ComputeCapabilities getComputeCapabilities() {
            return this.computeCapabilities;
        }
        
        /**
        * Optional. The compute capabilities in this location.
        * @param computeCapabilitiesValue The ComputeCapabilities value.
        */
        public void setComputeCapabilities(final ComputeCapabilities computeCapabilitiesValue) {
            this.computeCapabilities = computeCapabilitiesValue;
        }
        
        private String displayName;
        
        /**
        * Optional. The localized name of data center location.
        * @return The DisplayName value.
        */
        public String getDisplayName() {
            return this.displayName;
        }
        
        /**
        * Optional. The localized name of data center location.
        * @param displayNameValue The DisplayName value.
        */
        public void setDisplayName(final String displayNameValue) {
            this.displayName = displayNameValue;
        }
        
        private String name;
        
        /**
        * Optional. The name of a data center location that is valid for your
        * subscription.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. The name of a data center location that is valid for your
        * subscription.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        /**
        * Initializes a new instance of the Location class.
        *
        */
        public Location() {
            this.setAvailableServices(new ArrayList<String>());
        }
    }
}