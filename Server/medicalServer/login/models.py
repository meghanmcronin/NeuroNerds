from django.db import models
from django.contrib.auth.models import AbstractUser
from django.conf import settings
from medicalServer import helper
                             
                             
class User(AbstractUser):
    """Extend functionality of user"""
    relation = models.ManyToManyField(settings.AUTH_USER_MODEL,  blank=True)
    hash_id = models.CharField(max_length=32, default=helper.create_hash, unique=True)
    USER_CHOICES = (
        ('1', 'Doctor'),
        ('2', 'Patient')
    )
    user_type = models.CharField(choices=USER_CHOICES, max_length=10, default='2')


