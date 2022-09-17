package com.globomantics.inventorymanager.service;

import com.globomantics.inventorymanager.model.InventoryRecord;

import java.util.List;
import java.util.Optional;

public interface InventoryService {
    Optional<InventoryRecord> getInventoryRecord(Integer productId);

    Optional<InventoryRecord> purchaseProduct(Integer productId, Integer quantity);

    Optional<List<InventoryRecord>> getInventoryRecordList();
}
