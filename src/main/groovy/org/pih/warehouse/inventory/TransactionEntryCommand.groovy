/**
 * Copyright (c) 2012 Partners In Health.  All rights reserved.
 * The use and distribution terms for this software are covered by the
 * Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 * which can be found in the file epl-v10.html at the root of this distribution.
 * By using this software in any fashion, you are agreeing to be bound by
 * the terms of this license.
 * You must not remove this notice, or any other, from this software.
 **/
package org.pih.warehouse.inventory

import grails.validation.Validateable
import org.pih.warehouse.core.Location
import org.pih.warehouse.inventory.InventoryItem
import org.pih.warehouse.product.Product

class TransactionEntryCommand implements Validateable {

    boolean deleted

    InventoryItem inventoryItem
    String comment
    String reasonCode
    String lotNumber
    Location binLocation
    Product product
    Date expirationDate
    Integer quantity

    static constraints = {

    }
}
