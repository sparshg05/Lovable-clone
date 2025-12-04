package com.example.springProjects.Lovable_clone.service;

import com.example.springProjects.Lovable_clone.dto.subscription.CheckoutResponse;
import com.example.springProjects.Lovable_clone.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);
}
